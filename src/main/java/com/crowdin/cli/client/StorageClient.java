package com.crowdin.cli.client;

import com.crowdin.client.api.StorageApi;
import com.crowdin.common.Settings;

import java.io.File;

public class StorageClient extends Client {

    public StorageClient(Settings settings) {
        super(settings);
    }

    public Long uploadStorage(File file, String fileName) {
        StorageApi storageApi = new StorageApi(settings);
        return storageApi
            .uploadFile(file, fileName)
            .getResponseEntity()
            .getEntity()
            .getId();
    }
}
