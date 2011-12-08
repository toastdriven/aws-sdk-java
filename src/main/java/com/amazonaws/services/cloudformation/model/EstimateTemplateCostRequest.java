/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudformation.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#estimateTemplateCost(EstimateTemplateCostRequest) EstimateTemplateCost operation}.
 * <p>
 * Returns the estimated monthly cost of a template. The return value is
 * an AWS Simply Monthly Calculator URL with a query string that
 * describes the resources required to run the template.
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#estimateTemplateCost(EstimateTemplateCostRequest)
 */
public class EstimateTemplateCostRequest extends AmazonWebServiceRequest {

    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.) <p>Conditional: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String templateBody;

    /**
     * Location of file containing the template body. The URL must point to a
     * template located in an S3 bucket in the same region as the stack. For
     * more information, go to the <a
     * p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>. <p>Conditional: You must pass
     * <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String templateURL;

    /**
     * A list of <code>Parameter</code> structures that specify input
     * parameters.
     */
    private java.util.List<Parameter> parameters;

    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.) <p>Conditional: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Structure containing the template body. (For more information, go to
     *         the <a
     *         p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>.) <p>Conditional: You must pass
     *         <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public String getTemplateBody() {
        return templateBody;
    }
    
    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.) <p>Conditional: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody Structure containing the template body. (For more information, go to
     *         the <a
     *         p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>.) <p>Conditional: You must pass
     *         <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }
    
    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.) <p>Conditional: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody Structure containing the template body. (For more information, go to
     *         the <a
     *         p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>.) <p>Conditional: You must pass
     *         <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EstimateTemplateCostRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    
    
    /**
     * Location of file containing the template body. The URL must point to a
     * template located in an S3 bucket in the same region as the stack. For
     * more information, go to the <a
     * p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>. <p>Conditional: You must pass
     * <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return Location of file containing the template body. The URL must point to a
     *         template located in an S3 bucket in the same region as the stack. For
     *         more information, go to the <a
     *         p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>. <p>Conditional: You must pass
     *         <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public String getTemplateURL() {
        return templateURL;
    }
    
    /**
     * Location of file containing the template body. The URL must point to a
     * template located in an S3 bucket in the same region as the stack. For
     * more information, go to the <a
     * p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>. <p>Conditional: You must pass
     * <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL Location of file containing the template body. The URL must point to a
     *         template located in an S3 bucket in the same region as the stack. For
     *         more information, go to the <a
     *         p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>. <p>Conditional: You must pass
     *         <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }
    
    /**
     * Location of file containing the template body. The URL must point to a
     * template located in an S3 bucket in the same region as the stack. For
     * more information, go to the <a
     * p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>. <p>Conditional: You must pass
     * <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL Location of file containing the template body. The URL must point to a
     *         template located in an S3 bucket in the same region as the stack. For
     *         more information, go to the <a
     *         p://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>. <p>Conditional: You must pass
     *         <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EstimateTemplateCostRequest withTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    
    
    /**
     * A list of <code>Parameter</code> structures that specify input
     * parameters.
     *
     * @return A list of <code>Parameter</code> structures that specify input
     *         parameters.
     */
    public java.util.List<Parameter> getParameters() {
        
        if (parameters == null) {
            parameters = new java.util.ArrayList<Parameter>();
        }
        return parameters;
    }
    
    /**
     * A list of <code>Parameter</code> structures that specify input
     * parameters.
     *
     * @param parameters A list of <code>Parameter</code> structures that specify input
     *         parameters.
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>();
        if (parameters != null) {
            parametersCopy.addAll(parameters);
        }
        this.parameters = parametersCopy;
    }
    
    /**
     * A list of <code>Parameter</code> structures that specify input
     * parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <code>Parameter</code> structures that specify input
     *         parameters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EstimateTemplateCostRequest withParameters(Parameter... parameters) {
        if (getParameters() == null) setParameters(new java.util.ArrayList<Parameter>());
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>Parameter</code> structures that specify input
     * parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <code>Parameter</code> structures that specify input
     *         parameters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EstimateTemplateCostRequest withParameters(java.util.Collection<Parameter> parameters) {
        java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>();
        if (parameters != null) {
            parametersCopy.addAll(parameters);
        }
        this.parameters = parametersCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("TemplateBody: " + templateBody + ", ");
        sb.append("TemplateURL: " + templateURL + ", ");
        sb.append("Parameters: " + parameters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    