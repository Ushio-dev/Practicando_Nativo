package com.example.practicando.contactos.domain

import com.example.practicando.contactos.data.ContactoRepository
import com.example.practicando.contactos.data.model.ContactoEntity
import javax.inject.Inject


class DeleteContactUseCase @Inject constructor(private val contactoRepository: ContactoRepository) {
    suspend operator fun invoke(contactoEntity: ContactoEntity) {
        contactoRepository.delete(contactoEntity)
    }
}