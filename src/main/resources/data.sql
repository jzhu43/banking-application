CREATE TABLE accounts (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    account_number VARCHAR(50),
    account_type VARCHAR(50),
    balance DECIMAL(15, 2)
);

CREATE TABLE transactions (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(50),
    amount DECIMAL(15, 2),
    description VARCHAR(255),
    date DATE
);

INSERT INTO accounts (id, account_number, account_type, balance) VALUES
(1, '12345', 'Checking', 100.00),
(2, '23456', 'Savings', 200.00),
(3, '34567', 'Checking', 300.00),
(4, '45678', 'Savings', 400.00);

INSERT INTO transactions (id, type, amount, description, date) VALUES 
(0, 'Debit', 15.00, 'Payment for lunch', '2025-04-01'),
(1, 'Debit', 20.00, 'Payment for dinner', '2025-04-02');
