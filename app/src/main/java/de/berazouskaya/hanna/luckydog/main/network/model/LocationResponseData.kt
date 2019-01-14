package de.berazouskaya.hanna.luckydog.main.network.model

class LocationResponseData(val name : String?, val detailedName : String?, val iataCode : String?, val address : LocationAddress? )
class LocationAddress(val cityName : String?, val countryName : String?)
