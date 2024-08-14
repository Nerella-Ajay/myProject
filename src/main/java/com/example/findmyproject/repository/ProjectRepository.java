/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.findmyproject.repository;

import java.util.ArrayList;
import java.util.List;
import com.example.findmyproject.model.*;

public interface ProjectRepository {
    ArrayList<Project> getProjects();

    Project getProjectById(int projectId);

    Project addProject(int projectId);

    Project updateProject(int projectId, Project project);

    Project deleteProject(int ProjectId);

    List<Researcher> getProjectResearcher(int projectId);
}