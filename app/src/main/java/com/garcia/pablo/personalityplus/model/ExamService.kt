package com.garcia.pablo.personalityplus.model

import com.garcia.pablo.personalityplus.model.entities.Exam
import com.garcia.pablo.personalityplus.model.utils.examMock

class ExamService {
    fun getExam(): Exam {
        return examMock
    }
}