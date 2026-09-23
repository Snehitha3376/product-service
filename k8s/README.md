# Kubernetes

Build and push the three service images, replace `your-dockerhub-user` in the manifests, then:

kubectl apply -f namespace.yaml
kubectl apply -f keycloak.yaml
kubectl apply -f order-service.yaml
kubectl apply -f inventory-service.yaml
kubectl apply -f notification-service.yaml

Check:
kubectl get pods -n microservices
kubectl get services -n microservices
