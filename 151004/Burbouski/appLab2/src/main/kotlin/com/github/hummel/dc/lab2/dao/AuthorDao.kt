package com.github.hummel.dc.lab2.dao

import com.github.hummel.dc.lab2.bean.Author

interface AuthorDao {
	suspend fun create(authorEntity: Author): Long

	suspend fun deleteById(id: Long): Int

	suspend fun getAll(): List<Author?>

	suspend fun getById(id: Long): Author

	suspend fun update(authorEntity: Author): Int
}