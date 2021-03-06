/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.lrg.model.v20191010;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GwUpdateGatewayIdRequest extends RoaAcsRequest<GwUpdateGatewayIdResponse> {
	   

	private String big_region_name;

	private String status;
	public GwUpdateGatewayIdRequest() {
		super("LRG", "2019-10-10", "GwUpdateGatewayId");
		setUriPattern("/api/v2/gw/xgw/gw-server?action=updateGatewayId");
		setMethod(MethodType.POST);
	}

	public String getBig_region_name() {
		return this.big_region_name;
	}

	public void setBig_region_name(String big_region_name) {
		this.big_region_name = big_region_name;
		if(big_region_name != null){
			putBodyParameter("big_region_name", big_region_name);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<GwUpdateGatewayIdResponse> getResponseClass() {
		return GwUpdateGatewayIdResponse.class;
	}

}
