CREATE OR REPLACE PROCEDURE GenerateMonthlyStatement(
    p_account_id IN NUMBER
)
IS
BEGIN
    FOR rec IN (
        SELECT TransactionID,
               TransactionDate,
               Amount,
               TransactionType
        FROM Transactions
        WHERE AccountID = p_account_id
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            rec.TransactionID || ' ' ||
            rec.TransactionType || ' ' ||
            rec.Amount
        );
    END LOOP;
END;
/

BEGIN
    GenerateMonthlyStatement(101);
END;
/