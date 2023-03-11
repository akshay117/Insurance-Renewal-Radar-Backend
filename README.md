# Insurance-Renewal-Radar-Backend
To keep track of expiring insurance policies for customers , The app allows employees and admins to add customer details, upload and download insurance PDFs, view a list of expiring policies, and send notifications to customers to remind them of upcoming expirations.

# Set-up DB

```sql
CREATE TABLE wecareDB.customer_insurance (
  sl_no INT NOT NULL AUTO_INCREMENT,
  customer_name VARCHAR(100)  NULL,
  customer_phone_number VARCHAR(50) NULL,
  customer_vehicle_number VARCHAR(50) NULL,
  insurance_provider_company VARCHAR(50)  NULL,
  premium_amount DECIMAL(10, 2)  NULL,
  path VARCHAR(255) NULL,
  remarks TEXT,
  PRIMARY KEY (sl_no)
);

```


