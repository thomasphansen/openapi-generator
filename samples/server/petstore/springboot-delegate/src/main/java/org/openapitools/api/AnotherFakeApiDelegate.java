package org.openapitools.api;

import org.openapitools.model.Client;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * A delegate to be called by the {@link AnotherFakeApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

public interface AnotherFakeApiDelegate {

    /**
     * @see AnotherFakeApi#call123testSpecialTags
     */
    ResponseEntity<Client> call123testSpecialTags(Client client);

}
