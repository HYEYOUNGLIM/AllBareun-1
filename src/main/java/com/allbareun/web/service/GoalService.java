package com.allbareun.web.service;

import java.util.List;

import com.allbareun.web.entity.Cycle;
import com.allbareun.web.entity.Certification;
import com.allbareun.web.entity.CertificationView;
import com.allbareun.web.entity.Goal;
import com.allbareun.web.entity.GoalAllView;
import com.allbareun.web.entity.GoalCategory;
import com.allbareun.web.entity.GoalDetailView;
import com.allbareun.web.entity.GoalView;
import com.allbareun.web.entity.Group;
import com.allbareun.web.entity.Participation;
import com.allbareun.web.entity.User;

public interface GoalService {

	int insert(Goal goal, List<GoalCategory> gcList, List<Cycle> cList, List<Group> gList);
	int update(Goal goal);
	int updateRetryGoal(Goal goal, List<GoalCategory> gcList, List<Cycle> cList, List<Group> gList);
	int delete(Goal goal);
	Goal get(int id);

	// -------------------------- View --------------------------
	GoalAllView getAllView(int id);
	List<GoalAllView> getAllViewList(int userId);
	
	List<GoalView> getViewList(String categories, String startDate, String endDate, String days, int totalParticipants, String query);
	List<Certification> getCertListById(int goalId);
	
	GoalDetailView getDetailView(int id);
	CertificationView getAuthImage(int id);
	List<User> getProfile(int id);
	
}