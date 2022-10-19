package com.garcia.pablo.personalityplus.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.garcia.pablo.personalityplus.R
import com.garcia.pablo.personalityplus.databinding.ActivityExamBinding
import com.garcia.pablo.personalityplus.model.entities.Exam
import com.garcia.pablo.personalityplus.viewmodel.ExamViewModel

class ExamActivity : AppCompatActivity() {
    private val examViewModel: ExamViewModel = ExamViewModel()
    private val exam = examViewModel.getExam()

    private var _binding: ActivityExamBinding? = null
    private val binding: ActivityExamBinding get() = _binding!!

    private val onOptionChangedListener = object : OnOptionChangedListener {
        override fun onChanged(stepPosition: Int, radioButtonPosition: Int) {
            // TODO: Chamar a ViewModel e começar a lógica.
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityExamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecyclerView()

        binding.btFinish.setOnClickListener {
            // TODO: Chamar a view model
        }
    }

    fun setUpRecyclerView() {
        binding.rvExamList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvExamList.adapter = ExamAdapter(exam, onOptionChangedListener)
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}
