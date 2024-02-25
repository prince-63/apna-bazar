CREATE TABLE IF NOT EXISTS product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(255),
    product_price DECIMAL(10,2),
    product_rating DECIMAL(3,2),
    product_image_link VARCHAR(255),
    base_entity_id INT,
    created_at TIMESTAMP,
    created_by VARCHAR(255),
    FOREIGN KEY (base_entity_id) REFERENCES base_entity (id)
);
