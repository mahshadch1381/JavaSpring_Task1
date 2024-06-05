package TASK1.DB_demo.Service;

import TASK1.DB_demo.Model.AppInfo;
import TASK1.DB_demo.Repository.AppInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Arrays;
import java.util.List;

@Service
public class AppInfoService {

    private final String apiUrl = "https://api.pelak.com/boot/getallappinfo";

    @Autowired
    private AppInfoRepository appInfoRepository;

    public void fetchAndSaveAppInfo() {
        var restClient = RestClient.create();
        List<AppInfo> response = restClient.get()
                .uri(apiUrl)
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});

        if (response != null) {
            appInfoRepository.saveAll(response);
        }
    }
}
