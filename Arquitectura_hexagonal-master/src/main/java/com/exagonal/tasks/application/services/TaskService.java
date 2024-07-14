package com.exagonal.tasks.application.services;

import com.exagonal.tasks.domain.model.AdditionalTaskInfo;
import com.exagonal.tasks.domain.model.Task;
import com.exagonal.tasks.domain.ports.in.CreateTaskUseCase;
import com.exagonal.tasks.domain.ports.in.DeleteTaskUseCase;
import com.exagonal.tasks.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.exagonal.tasks.domain.ports.in.RetrieveTaskUseCase;
import com.exagonal.tasks.domain.ports.in.UpdateTaskUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final CreateTaskUseCase createTaskUseCase;
    private final RetrieveTaskUseCase retrieveTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;

    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }

    public Optional<Task> getTaskById(Long id) {
        return retrieveTaskUseCase.getTaskById(id);
    }

    public List<Task> getAllTasks() {
        return retrieveTaskUseCase.getAllTasks();
    }

    public Optional<Task> updateTask(Long id, Task updatedTask) {
        return updateTaskUseCase.updateTask(id, updatedTask);
    }

    public boolean deleteTask(Long id) {
        return deleteTaskUseCase.deleteTask(id);
    }

    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return getAdditionalTaskInfoUseCase.getAdditionalTaskInfo(taskId);
    }
}
