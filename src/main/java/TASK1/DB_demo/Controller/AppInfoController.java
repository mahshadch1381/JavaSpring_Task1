package TASK1.DB_demo.Controller;

import TASK1.DB_demo.Model.AppInfo;
import TASK1.DB_demo.Repository.AppInfoRepository;
import TASK1.DB_demo.Service.AppInfoService.AppInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/appinfo")
public class AppInfoController {

    @Autowired
    private AppInfoService appInfoService;
    @Autowired
    AppInfoRepository appInfoRepository;

    @GetMapping("/fetchAppInfo")
    public String fetchAppInfo() {
        return appInfoService.fetchAndSaveAppInfo();

    }

    @GetMapping(path="/allAppInfo")
    public @ResponseBody Iterable<AppInfo> getAllUsers()
    {
        return appInfoRepository.findAll();
    }
}
