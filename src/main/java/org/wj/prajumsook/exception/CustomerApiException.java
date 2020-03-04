package org.wj.prajumsook.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerApiException {

    private ApiException apiException;
    
    

	public CustomerApiException(ApiException apiException) {
		super();
		this.apiException = apiException;
	}

	public ApiException getApiException() {
		return apiException;
	}

	public void setApiException(ApiException apiException) {
		this.apiException = apiException;
	}

}
