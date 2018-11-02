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

package com.aliyuncs.lubancloud.transform.v20180509;

import com.aliyuncs.lubancloud.model.v20180509.SubmitCutoutTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitCutoutTaskResponseUnmarshaller {

	public static SubmitCutoutTaskResponse unmarshall(SubmitCutoutTaskResponse submitCutoutTaskResponse, UnmarshallerContext context) {
		
		submitCutoutTaskResponse.setRequestId(context.stringValue("SubmitCutoutTaskResponse.RequestId"));
		submitCutoutTaskResponse.setTaskId(context.longValue("SubmitCutoutTaskResponse.TaskId"));
	 
	 	return submitCutoutTaskResponse;
	}
}