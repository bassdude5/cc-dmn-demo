# cc-dmn-demo

## Introduction
A simple sample DMN that illustrates a credit card transaction being evaluated against its historical credit card transactions if the historical transaction matches a given list of MCC's (Merchant Category Code).

## Tool Versions:
Java: <code>openjdk version "17.0.11" 2024-04-16 LTS</code>
Maven: <code>Apache Maven 3.8.1</code>

## Build:
To build the project, simply run a mvn clean install from your command line

## Run (dev):
To run the quarkus based DMN service in dev mode, run <code>mvn clean compile quarkus:dev</code> and wait for the service to come up

## Testing
To test the project, see <code>...\src\test\resources\sampleRequests</code> for 3 different .json files that you can run via the Swagger ([http](http://localhost:8080/q/swagger-ui/), use the POST on/CreditTransaction) or via running curl (See below) or loading the request into another rest client (eg postman)

### Sample curl, using sample1.json as a request

<code>curl -X 'POST' \
  'http://localhost:8080/CreditTransaction' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
    "creditTransaction": {
      "accountNumber": "acc123",
      "amount": 3,
      "history": [
        {
          "accountNumber": "acc123",
          "mcc": 111,
          "amount": 1
        },
        {
          "accountNumber": "acc123",
          "mcc": 111,
          "amount": 1
        }
      ]
    }
  }'</code>