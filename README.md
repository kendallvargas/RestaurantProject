# Restaurant Management System

A graphical user interface (GUI) application designed to manage basic restaurant operations such as creating products, placing orders, and generating reports. This project is built with Java and Swing, incorporating JSON serialization/deserialization using the GSON library to keep stored in the system the products and orders created.

## Features

### Core Functionalities
- **Product Management**:
  - Add new products with validation to avoid duplicates.
  - Input validation ensures correct data types and prevents empty fields.
- **Order Management**:
  - Create and manage orders with existing products.
  - Validation ensures orders cannot be created without products.
- **General Report**:
  - Generate and view a report summarizing all placed orders.
 
### Fees and Discounts
- **Fees**:
  - A **10% service fee** is applied to the total amount of the order.
  - A **13% tax** is added to the final total.
- **Discount Coupons**:
  - `DSC5`: **5% discount** on the total purchase.
  - `DSC10`: **10% discount** on the total purchase.
  - `DSC15`: **15% discount** on the total purchase.

### Additional Validations
- Prevents inserting text in numeric fields.
- Ensures that a report cannot be generated without an active order.
- Displays errors for missing fields or invalid inputs.

### Data Persistence
- Uses JSON format for serialization and deserialization with the GSON library.
- Saves data (products and orders) in a `.txt` file located within the project directory.

## Technical Details

### Requirements
- Java 8 or higher.
- GSON library for JSON operations.

### Design
- **GUI**: Created using Swing, with the integration of graphical components in Netbeans.
- **File Structure**: All generated files are stored in the root of the project.

## How to Run
1. Clone the repo
1. Open the project in an IDE that supports Java (e.g., NetBeans).
2. Ensure the GSON library is included in the project dependencies.
3. Run the project using the IDE's execution options.

> Note: The project is executed directly from the source code and does not include a packaged `.jar` file at this stage.

## Demonstration
A video demonstrating the program's functionality is available. It includes:

### Adding a new product.

https://github.com/user-attachments/assets/037611cb-0b74-4cec-a97e-7131d31816e1


### Creating an order and generating the general report.

https://github.com/user-attachments/assets/69343dc9-16a6-4be3-a6cb-db5a99931cb3


## Future Improvements
- Refactor the codebase to adopt better programming practices.
- Enhance the user interface for a more modern and intuitive experience.
- Add more features such as:
  - Product filtering and searching.
  - Exporting data in different formats (e.g., CSV, Excel).

## Author
Kendall Vargas

## License
This project is created for practice purposes and is not intended for commercial use. No specific license is applied.

