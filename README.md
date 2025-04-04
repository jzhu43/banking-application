# banking-application
A banking application for interview

**Features:**

Customers should be able to view their list of accounts and account details, including their:
- balance
- bank account number
- account type

Customers should be able to create a new transaction to move money within the bank. A transaction should include the following:
transaction type (credit or debit)
- amount
- description
- date
Customers should be able to download their monthly statements given a month. The statement should include transactions for the entire month.

APIs Created:

**2 Controllers:**

  **AccountController:**

    GET API /accounts

    GET API /accounts/{id}

  **TransactionController:**

    POST API /transactions

    GET API /transactions/statements/{month}

# Task 1: Implement accounts and transaction APIs (Completed)
- Create API endpoints for above features
- Include documentation for the API, you may use any specification of your choice (OpenAPI, Swagger, etc.)
- Use mock data
- Provide appropriate documentation for your application

  # Results
  **GET API /accounts**
  
  Using Mock data, this API can fetch the list of accounts.
  ![image](https://github.com/user-attachments/assets/c3b490f4-8d05-4568-936c-bc506884991e)
  
  **GET API /accounts/{id}**
  
  Using Mock data, this API can fetch the account based off of ID given.
  ![image](https://github.com/user-attachments/assets/d40bf2db-ce7a-4431-8c92-5ab59cc7731b)

  **POST API /transactions**
  
  This API can create transactions and store into a mock data list.
  ![image](https://github.com/user-attachments/assets/d12e9470-6935-46d4-af3a-0b6f3c8e70ef)

  **GET API /transactions/statements/{month}**
  
  Using Mock data, this API can fetch transaction statements based off of month given.
  ![image](https://github.com/user-attachments/assets/a929184b-8cc0-42ce-bc2b-92d020e0f2fe)

  

# Task 2: Implement data layer
- Use an in-memory H2 database, this is important to ensure that the code can be run locally without additional local set up

# Task 3: Implement authentication
- Write an Ouath 2.0 client to authenticate and authorize the users. Please feel free to use stubs or mock controllers that can authenticate the request. You can create your own simple mock or use an open source solution https://github.com/navikt/mock-oauth2-server

