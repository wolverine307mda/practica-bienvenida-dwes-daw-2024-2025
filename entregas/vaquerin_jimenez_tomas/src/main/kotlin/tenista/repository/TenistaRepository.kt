package org.example.tenista.repository

import org.example.tenista.models.Tenista

interface TenistasRepository {
    fun findAll(): List<Tenista>
    fun findById(id: Long): Tenista?
    fun save(tenista: Tenista): Tenista
    fun update(id: Long, tenista: Tenista): Tenista?
    fun delete(id: Long): Tenista?
}