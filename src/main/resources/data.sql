-- Assuming your Product table has the following columns: id, name, price, rating, imageLink

-- Assuming your Product table has the following columns: id, name, price, rating, imageLink

INSERT INTO `product` (product_id, product_name, product_price, product_rating, product_image_link, created_by, created_at) VALUES
(1, 'fresh orange', '4.99', '5', '/assets/images/product-1.png', 'admin', CURRENT_TIMESTAMP),
(2, 'fresh onion', '4.99', '4.5', '/assets/images/product-2.png', 'admin', CURRENT_TIMESTAMP),
(3, 'fresh meat', '10.99', '4.5', '/assets/images/product-3.png', 'admin', CURRENT_TIMESTAMP),
(4, 'fresh cabbage', '6.99', '4', '/assets/images/product-4.png', 'admin', CURRENT_TIMESTAMP),
(5, 'fresh potato', '5.99', '4.5', '/assets/images/product-5.png', 'admin', CURRENT_TIMESTAMP),
(6, 'fresh avocado', '7.99', '4.5', '/assets/images/product-6.png', 'admin', CURRENT_TIMESTAMP),
(7, 'fresh carrot', '3.99', '4', '/assets/images/product-7.png', 'admin', CURRENT_TIMESTAMP),
(8, 'green lemon', '8.99', '4.5', '/assets/images/product-8.png', 'admin', CURRENT_TIMESTAMP);


