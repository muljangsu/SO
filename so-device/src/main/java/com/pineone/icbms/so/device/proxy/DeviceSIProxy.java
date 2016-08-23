package com.pineone.icbms.so.device.proxy;

import com.pineone.icbms.so.device.entity.ResultMessage;
import com.pineone.icbms.so.device.util.ClientProfile;
import com.pineone.icbms.so.device.util.ClientService;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DeviceSIProxy implements DeviceControlProxy {

    /**
     * The actual device control request.
     * 1, Device 제어(post)
     * @param requestUrl
     * @param requestBody
     * @return
     */

    private ClientService clientService = new ClientService();
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public ResultMessage deviceControlRequest(String requestUrl,String requestBody) {
        //
        ResultMessage resultMessage = new ResultMessage();

        String responseData = clientService.requestPostService(requestUrl, requestBody);
        try {
            resultMessage = mapper.readValue(responseData, ResultMessage.class);
        } catch (IOException e) {
            e.printStackTrace();
            resultMessage.set_resultCode(ClientProfile.RESPONSE_FIALURE_CODE);
        } finally {
            return resultMessage;
        }
    }

}
