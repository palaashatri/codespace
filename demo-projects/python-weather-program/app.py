'''
This Python program gets the current weather forecast for a city from OpenWeatherMap.
The city name is passed as a command-line argument.
The program prints the current temperature, pressure, humidity, and weather description.
Usage: python app.py <city_name>

'''

# Import requests library to make HTTP requests
import requests
# Import sys library to access command-line arguments
import sys

# Get the city name from the first argument
city = sys.argv[1]

# If the city name contains spaces, replace them with %20
city = city.replace(" ", "%20")

# If the city name contains non-ASCII characters, encode them in UTF-8
city = city.encode("utf-8")
if city != sys.argv[1]:
    city = city.decode("utf-8")

# If the city name is empty, print an error message and exit the program
if city == "":
    print("Please enter a city name.")
    exit()

# Define the API key and the base URL for OpenWeatherMap
# Take API Key from system environment variable
api_key = os.environ.get("OPENWEATHERMAP_API_KEY")
base_url = "http://api.openweathermap.org/data/2.5/weather?"

# Construct the complete URL with the city name, the API key and the unit system
complete_url = f"{base_url}q={city}&appid={api_key}&units=metric"

# Use a try-except block to handle any exceptions
try:
    # Make a GET request to the complete URL and get the response
    response = requests.get(complete_url)
    # Convert the response to a JSON object
    data = response.json()
    # Check if the response is valid (status code 200)
    if data["cod"] == 200:
        # Use a dictionary comprehension to get the main weather data from the JSON object
        main = {key: data["main"][key] for key in ["temp", "pressure", "humidity"]}
        # Get the weather description from the JSON object
        description = data["weather"][0]["description"]

        # Print the weather forecast for the city
        print(f"Weather forecast for {city}:")
        print(f"Temperature: {main['temp']:.2f} °C")
        print(f"Pressure: {main['pressure']} hPa")
        print(f"Humidity: {main['humidity']} %")
        print(f"Description: {description}")

    else:
        # Print an error message if the response is invalid
        print("Invalid city name or API key. Please try again.")
except Exception as e:
    # Print the exception message if any error occurs
    print(f"An error occurred: {e}")
