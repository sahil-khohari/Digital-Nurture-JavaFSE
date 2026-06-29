SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT l.LoanID, l.InterestRate
        FROM Loans l
        JOIN Customers c
        ON l.CustomerID = c.CustomerID
        WHERE FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) > 60
    )
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE LoanID = rec.LoanID;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Interest rates updated successfully.');
END;
/