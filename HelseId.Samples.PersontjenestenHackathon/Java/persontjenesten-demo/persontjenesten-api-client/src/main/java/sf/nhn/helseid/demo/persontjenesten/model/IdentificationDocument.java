/*
 * Persontjenesten API - ET
 * ## Introduction  The Person API is a copy of the [National Population Register (\"Folkeregisteret\")](https://www.skatteetaten.no/en/person/national-registry/about/) serving the norwegian health sector, maintained by Norsk helsenett. More detailed information on data coming from the National Population Register is also available in Norwegian here: [Information Model](https://skatteetaten.github.io/folkeregisteret-api-dokumentasjon/informasjonsmodell/)  More detailed information about the Person API service, including how to get access, is documented here: [Persontjenesten](https://www.nhn.no/samhandlingsplattform/grunndata/persontjenesten)  ## Disclaimer  The Person API is under continuous development and will be subject to changes without notice. The changes will follow semantic versioning to prevent breaking changes. Legacy versions will be available for 6 months before they are discontinued. We encourage consumers to follow our changelog in order to keep track of any changes. Send feedback and questions to [persontjenesten@nhn.no](mailto:persontjenesten@nhn.no)  ## Changelog  See [Changelog](../static/changelog/index.html)  ## Synthetic test data  Data in our test environment is using synthetic test data coming from the [Synthetic National Register](https://skatteetaten.github.io/testnorge-tenor-dokumentasjon/kilder#syntetisk-folkeregister). To browse the data available, you can log in using ID-porten at [Testnorge](https://testdata.skatteetaten.no/web/testnorge/)  ## Authentication and authorization  This API uses [HelseID](https://www.nhn.no/samhandlingsplattform/helseid) for authentication and authorization. To use the API you will need to have a valid HelseID token with a valid scope.  There are two scopes available to consume resources from the Person API: - **ReadWithLegalBasis** | Scope: `nhn:hgd-persontjenesten-api/read-with-legal-basis`    This scope provides read access to information in the authorization bundle \"public with legal basis\" (aka statutory authority).    For version 0.5 name was `nhn:hgd-persontjenesten-api/read`  - **ReadNoLegalBasis** | Scope: `nhn:hgd-persontjenesten-api/read-no-legal-basis`    This scope provides read access to information in the public bundle \"public with**out** legal basis\". 
 *
 * The version of the OpenAPI document: 1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sf.nhn.helseid.demo.persontjenesten.model;

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import sf.nhn.helseid.demo.persontjenesten.JSON;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * Identification Document contains information on what documentation  was used to verify the identity of the person  &lt;br&gt;FREG: Identifikasjonsdokument / Legitimasjonsdokument
 */
@ApiModel(description = "Identification Document contains information on what documentation  was used to verify the identity of the person  <br>FREG: Identifikasjonsdokument / Legitimasjonsdokument")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-21T11:48:55.741350900+02:00[Europe/Oslo]")
public class IdentificationDocument {
  public static final String SERIALIZED_NAME_REGISTERED_AT = "registeredAt";
  @SerializedName(SERIALIZED_NAME_REGISTERED_AT)
  private OffsetDateTime registeredAt;

  public static final String SERIALIZED_NAME_IS_VALID = "isValid";
  @SerializedName(SERIALIZED_NAME_IS_VALID)
  private Boolean isValid;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_VALID_FROM = "validFrom";
  @SerializedName(SERIALIZED_NAME_VALID_FROM)
  private OffsetDateTime validFrom;

  public static final String SERIALIZED_NAME_VALID_TO = "validTo";
  @SerializedName(SERIALIZED_NAME_VALID_TO)
  private OffsetDateTime validTo;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER = "documentNumber";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER)
  private String documentNumber;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_ISSUER_COUNTRY = "issuerCountry";
  @SerializedName(SERIALIZED_NAME_ISSUER_COUNTRY)
  private String issuerCountry;

  public static final String SERIALIZED_NAME_ISSUER_NAME = "issuerName";
  @SerializedName(SERIALIZED_NAME_ISSUER_NAME)
  private String issuerName;

  public static final String SERIALIZED_NAME_DOCUMENT_VALID_FROM = "documentValidFrom";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_VALID_FROM)
  private OffsetDateTime documentValidFrom;

  public static final String SERIALIZED_NAME_DOCUMENT_VALID_TO = "documentValidTo";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_VALID_TO)
  private OffsetDateTime documentValidTo;

  public static final String SERIALIZED_NAME_DOCUMENT_VERIFICATION = "documentVerification";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_VERIFICATION)
  private IdentificationDocumentDocumentVerification documentVerification;

  public IdentificationDocument() {
  }

  public IdentificationDocument registeredAt(OffsetDateTime registeredAt) {
    
    this.registeredAt = registeredAt;
    return this;
  }

   /**
   * &lt;br&gt;FREG: Ajourholdstidspunkt
   * @return registeredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<br>FREG: Ajourholdstidspunkt")

  public OffsetDateTime getRegisteredAt() {
    return registeredAt;
  }


  public void setRegisteredAt(OffsetDateTime registeredAt) {
    this.registeredAt = registeredAt;
  }


  public IdentificationDocument isValid(Boolean isValid) {
    
    this.isValid = isValid;
    return this;
  }

   /**
   * &lt;br&gt;FREG: ErGjeldende
   * @return isValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<br>FREG: ErGjeldende")

  public Boolean getIsValid() {
    return isValid;
  }


  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }


  public IdentificationDocument source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * &lt;br&gt;FREG: Kilde
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<br>FREG: Kilde")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public IdentificationDocument reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * &lt;br&gt;FREG: Aarsak
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<br>FREG: Aarsak")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public IdentificationDocument validFrom(OffsetDateTime validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * &lt;br&gt;FREG: Gyldighetstidspunkt
   * @return validFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<br>FREG: Gyldighetstidspunkt")

  public OffsetDateTime getValidFrom() {
    return validFrom;
  }


  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }


  public IdentificationDocument validTo(OffsetDateTime validTo) {
    
    this.validTo = validTo;
    return this;
  }

   /**
   * &lt;br&gt;FREG: Opphoerstidspunkt
   * @return validTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<br>FREG: Opphoerstidspunkt")

  public OffsetDateTime getValidTo() {
    return validTo;
  }


  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }


  public IdentificationDocument documentNumber(String documentNumber) {
    
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * Identification number on the document used for identity verification  I.e. a passport number  &lt;br&gt;FREG: Identifikasjondokumentnummer
   * @return documentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZS 8000139", value = "Identification number on the document used for identity verification  I.e. a passport number  <br>FREG: Identifikasjondokumentnummer")

  public String getDocumentNumber() {
    return documentNumber;
  }


  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }


  public IdentificationDocument documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * Type of documentation.  I.e. driver license or passport  &lt;br&gt;FREG: Identifikasjondokumenttype
   * @return documentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pass", value = "Type of documentation.  I.e. driver license or passport  <br>FREG: Identifikasjondokumenttype")

  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public IdentificationDocument issuerCountry(String issuerCountry) {
    
    this.issuerCountry = issuerCountry;
    return this;
  }

   /**
   * Name of the country the document is issued in  &lt;br&gt;Remarks:   Newest updates uses ISO 3166-1 Alpha 3 for country codes  XXK &#x3D; Kosovo even if document contains \&quot;RKS\&quot;  Freg: Utstederland
   * @return issuerCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "POL", value = "Name of the country the document is issued in  <br>Remarks:   Newest updates uses ISO 3166-1 Alpha 3 for country codes  XXK = Kosovo even if document contains \"RKS\"  Freg: Utstederland")

  public String getIssuerCountry() {
    return issuerCountry;
  }


  public void setIssuerCountry(String issuerCountry) {
    this.issuerCountry = issuerCountry;
  }


  public IdentificationDocument issuerName(String issuerName) {
    
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Name of the issuer  &lt;br&gt;FREG: Utstedernavn
   * @return issuerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the issuer  <br>FREG: Utstedernavn")

  public String getIssuerName() {
    return issuerName;
  }


  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  public IdentificationDocument documentValidFrom(OffsetDateTime documentValidFrom) {
    
    this.documentValidFrom = documentValidFrom;
    return this;
  }

   /**
   * Time and date document is valid from  &lt;br&gt;FREG: GyldigFra
   * @return documentValidFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time and date document is valid from  <br>FREG: GyldigFra")

  public OffsetDateTime getDocumentValidFrom() {
    return documentValidFrom;
  }


  public void setDocumentValidFrom(OffsetDateTime documentValidFrom) {
    this.documentValidFrom = documentValidFrom;
  }


  public IdentificationDocument documentValidTo(OffsetDateTime documentValidTo) {
    
    this.documentValidTo = documentValidTo;
    return this;
  }

   /**
   * Time and date document is valid to  &lt;br&gt;FREG: GyldigTil
   * @return documentValidTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time and date document is valid to  <br>FREG: GyldigTil")

  public OffsetDateTime getDocumentValidTo() {
    return documentValidTo;
  }


  public void setDocumentValidTo(OffsetDateTime documentValidTo) {
    this.documentValidTo = documentValidTo;
  }


  public IdentificationDocument documentVerification(IdentificationDocumentDocumentVerification documentVerification) {
    
    this.documentVerification = documentVerification;
    return this;
  }

   /**
   * Get documentVerification
   * @return documentVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentificationDocumentDocumentVerification getDocumentVerification() {
    return documentVerification;
  }


  public void setDocumentVerification(IdentificationDocumentDocumentVerification documentVerification) {
    this.documentVerification = documentVerification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificationDocument identificationDocument = (IdentificationDocument) o;
    return Objects.equals(this.registeredAt, identificationDocument.registeredAt) &&
        Objects.equals(this.isValid, identificationDocument.isValid) &&
        Objects.equals(this.source, identificationDocument.source) &&
        Objects.equals(this.reason, identificationDocument.reason) &&
        Objects.equals(this.validFrom, identificationDocument.validFrom) &&
        Objects.equals(this.validTo, identificationDocument.validTo) &&
        Objects.equals(this.documentNumber, identificationDocument.documentNumber) &&
        Objects.equals(this.documentType, identificationDocument.documentType) &&
        Objects.equals(this.issuerCountry, identificationDocument.issuerCountry) &&
        Objects.equals(this.issuerName, identificationDocument.issuerName) &&
        Objects.equals(this.documentValidFrom, identificationDocument.documentValidFrom) &&
        Objects.equals(this.documentValidTo, identificationDocument.documentValidTo) &&
        Objects.equals(this.documentVerification, identificationDocument.documentVerification);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredAt, isValid, source, reason, validFrom, validTo, documentNumber, documentType, issuerCountry, issuerName, documentValidFrom, documentValidTo, documentVerification);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationDocument {\n");
    sb.append("    registeredAt: ").append(toIndentedString(registeredAt)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    issuerCountry: ").append(toIndentedString(issuerCountry)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    documentValidFrom: ").append(toIndentedString(documentValidFrom)).append("\n");
    sb.append("    documentValidTo: ").append(toIndentedString(documentValidTo)).append("\n");
    sb.append("    documentVerification: ").append(toIndentedString(documentVerification)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("registeredAt");
    openapiFields.add("isValid");
    openapiFields.add("source");
    openapiFields.add("reason");
    openapiFields.add("validFrom");
    openapiFields.add("validTo");
    openapiFields.add("documentNumber");
    openapiFields.add("documentType");
    openapiFields.add("issuerCountry");
    openapiFields.add("issuerName");
    openapiFields.add("documentValidFrom");
    openapiFields.add("documentValidTo");
    openapiFields.add("documentVerification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentificationDocument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IdentificationDocument.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentificationDocument is not found in the empty JSON string", IdentificationDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IdentificationDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdentificationDocument` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("documentNumber") != null && !jsonObj.get("documentNumber").isJsonNull()) && !jsonObj.get("documentNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentNumber").toString()));
      }
      if ((jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull()) && !jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
      if ((jsonObj.get("issuerCountry") != null && !jsonObj.get("issuerCountry").isJsonNull()) && !jsonObj.get("issuerCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerCountry").toString()));
      }
      if ((jsonObj.get("issuerName") != null && !jsonObj.get("issuerName").isJsonNull()) && !jsonObj.get("issuerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerName").toString()));
      }
      // validate the optional field `documentVerification`
      if (jsonObj.get("documentVerification") != null && !jsonObj.get("documentVerification").isJsonNull()) {
        IdentificationDocumentDocumentVerification.validateJsonObject(jsonObj.getAsJsonObject("documentVerification"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentificationDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentificationDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentificationDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentificationDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentificationDocument>() {
           @Override
           public void write(JsonWriter out, IdentificationDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentificationDocument read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdentificationDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentificationDocument
  * @throws IOException if the JSON string is invalid with respect to IdentificationDocument
  */
  public static IdentificationDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentificationDocument.class);
  }

 /**
  * Convert an instance of IdentificationDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

