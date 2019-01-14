package de.berazouskaya.hanna.luckydog.main.network.model

class AmadeusMetaData(val count : Int?, val links: AmadeusPaginationLinks? )

class AmadeusPaginationLinks(val self : String?, val next : String?, val last : String?)