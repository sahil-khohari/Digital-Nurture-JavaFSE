SET SERVEROUTPUT ON;

BEGIN
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE Balance > 10000;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP status updated successfully.');
END;
/