# Inventory Management System

A student-friendly full-stack inventory project built with React.js, Bootstrap, Java, Spring Boot, and MySQL.

## Technology Used

- React.js, HTML, CSS, JavaScript, Bootstrap
- Java and Spring Boot
- MySQL

## Zero-cost Design

This project runs locally with free tools only. It does not use paid APIs, paid databases, cloud services, Firebase, MongoDB, Tailwind, Express, or Next.js.

## Project Structure

```text
inventory-management-system/
  frontend/
    src/
      api.js
      App.jsx
      main.jsx
      styles.css
  backend/
    src/main/java/com/excelr/inventorymanagementsystem/
      config/
      controller/
      model/
      repository/
      service/
  database/
    schema.sql
```

## Features

- Add stock items
- View saved records
- Search records
- Edit details
- Change status
- Delete records
- Basic form validation and API error messages

## Run Backend

Set your MySQL password once:

```powershell
$env:MYSQL_PASSWORD="your-mysql-password"
```

Then run:

```powershell
cd "E:\Excelr Projects\inventory-management-system\backend"
"E:\Excelr Projects\tools\apache-maven-3.9.16\bin\mvn.cmd" spring-boot:run
```

## Run Frontend

```powershell
cd "E:\Excelr Projects\inventory-management-system\frontend"
npm install
npm run dev
```

## API Endpoints

- `GET /api/inventory-management-system/items`
- `POST /api/inventory-management-system/items`
- `PUT /api/inventory-management-system/items/{id}`
- `DELETE /api/inventory-management-system/items/{id}`
