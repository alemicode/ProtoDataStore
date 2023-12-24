package com.example.protodatastore

import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.serialization.Serializable

@Serializable
data class AppSettings(
    val language: Language = Language.ENGLISH,
    val name: String = "Better call MO",
    val knownLocations: PersistentList<Location> = persistentListOf()
)

@Serializable
data class Location(
    val lat: Double,
    val lng: Double
)

@Serializable
enum class Language {
    ENGLISH, GERMAN, SPANISH
}