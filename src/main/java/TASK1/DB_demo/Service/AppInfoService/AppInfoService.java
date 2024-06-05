package TASK1.DB_demo.Service.AppInfoService;

import TASK1.DB_demo.Model.AppInfo;
import TASK1.DB_demo.Repository.AppInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class AppInfoService {

    private final String apiUrl = "https://api.pelak.com/boot/getallappinfo";

    @Autowired
    private AppInfoRepository appInfoRepository;

    public String fetchAndSaveAppInfo() {
        try {
            var restClient = RestClient.create();
            List<AppInfo> response = restClient.get()
                    .uri(apiUrl)
                    .retrieve()
                    .body(new ParameterizedTypeReference<>() {}); // to deserialization jason response

            if (response != null) {
                appInfoRepository.saveAll(response);
                return "App info fetched and saved successfully.";
            }
            return "We could not get any response.";
        }catch (Exception e){
            return e.getMessage();
        }

    }
}
