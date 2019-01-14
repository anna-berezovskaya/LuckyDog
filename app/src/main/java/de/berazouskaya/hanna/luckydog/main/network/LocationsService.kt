package de.berazouskaya.hanna.luckydog.main.network

import de.berazouskaya.hanna.luckydog.main.network.model.BaseAmadeusResponse
import de.berazouskaya.hanna.luckydog.main.network.model.LocationResponseData

interface LocationsService{

    fun locationSearch() : BaseAmadeusResponse<LocationResponseData>
}