package com.bump.demo.service;

import com.bump.demo.service.pojo.response.ExternalResponse;
import java.util.List;

public interface IExternalApiService {

    ExternalResponse getResponse(String username);

}
