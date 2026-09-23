# Complete Microservices Application

Assignment starter package for:
- Order Service
- Inventory Service
- Notification Service
- Keycloak security
- OpenAPI documentation
- Kubernetes deployment

Ports: Order 8082, Inventory 8083, Notification 8084, Keycloak 8080.

## Local setup
From this folder:
docker compose up -d

Keycloak: http://localhost:8080
Admin: admin / admin123

Swagger:
- http://localhost:8082/swagger-ui.html
- http://localhost:8083/swagger-ui.html
- http://localhost:8084/swagger-ui.html

Student user in the imported realm:
student / student123

## Kubernetes
The k8s directory contains starter manifests. Replace `your-dockerhub-user` with your registry username after building/pushing service images.
