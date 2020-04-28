
#To build and test application:
mvn clean install

#To run tests:
mvn test

#To build docker:
docker build -f Dockerfile -t tryapi .

#To run docker image at port 5000:
docker run -p 5000:5000 tryapi

#Application will run at:
localhost:5000/greeting

