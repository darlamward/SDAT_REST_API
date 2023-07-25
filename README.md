# Aviation REST API
An uncomplicated REST API designed for an aviation-oriented data model. Its purpose is to facilitate the administration of cities, passengers, airports, and aircrafts.
This program is designed to work in conjunction with the MySqlWorkbench database, which is referred to as "QAP2SDAT."

## Running the Project in Docker

To execute the project in Docker, follow these steps:

  1. Ensure that Docker is installed on your machine if you haven't done so already.

  2. Clone this repository to your local machine.

  3. Open a terminal and navigate to the project directory.

  4. Build the Docker image using the following command:

    docker build -t qap2sdat .

  5. Launch the Docker container using the following command:

    docker run -p 8080:8080 qap2sdat
    
  Alternatively, you can run the project through Docker Desktop with the following command:

    docker-compose up
    
Once the container is up and running, the API should be accessible at http://localhost:8080.


## Testing the API

Now to test the API Endpoints!

  ### Add a City:

    Endpoint: POST http://localhost:8080/cities

Sample JSON Payload:

    {
      "name": "Toronto",
      "province": "ON"
    }

  ### Add a Passenger:

    Endpoint: POST http://localhost:8080/passenger

Sample JSON Payload:

    {
      "firstName": "John",
      "lastName": "Doe",
      "phoneNumber": "123-4567",
    }

### Create an Airport:

    Endpoint: POST http://localhost:8080/airport

Sample JSON Payload:

    {
       "code": "YYT",
       "name": "St.John's International Airport",
    }

### Create an Aircraft:

    Endpoint: POST http://localhost:8080/aircrafts
    
Sample JSON Payload:

    {
      "type": "Boeing 737",
      "airlineName": "WestJet",
      "noOfPassengers": 215
    }


## GET Key Relationships

Note: Replace <city_id>,<passenger_id>,<aircraft_id> with the proper ID number of your search.

### Cities have many airports

    GET http://localhost:8080/cities/<city_id>/airports

### Passengers can fly on many different aircrafts

    GET http://localhost:8080/passenger/<passenger_id>/aircraft

### Aircrafts can travel to/from many different airports

    GET http://localhost:8080/aircrafts/<aircraft_id>/airports

