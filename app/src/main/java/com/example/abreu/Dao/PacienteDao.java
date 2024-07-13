package com.example.abreu.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.abreu.Models.Paciente;

import java.util.List;

@Dao
public interface PacienteDao {

    @Query("SELECT * FROM Paciente")
    List<Paciente> obtenerPaciente();


    @Query("SELECT *FROM Paciente WHERE cedula=:cedula ")
    Paciente obtenerPaciente(String cedula);

    @Insert
    void agregarPaciente (Paciente...Paciente);

    @Query("DELETE FROM Paciente WHERE cedula=:cedula")
    void eliminarAlumno(String cedula);
}
