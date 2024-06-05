package TASK1.DB_demo.Repository;

import TASK1.DB_demo.Model.AppInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppInfoRepository extends JpaRepository<AppInfo, Long> {

}
