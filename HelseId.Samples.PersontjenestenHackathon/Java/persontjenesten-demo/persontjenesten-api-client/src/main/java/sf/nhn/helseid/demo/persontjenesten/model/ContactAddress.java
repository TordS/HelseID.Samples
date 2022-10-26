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
 * &lt;br&gt;FREG: Kontaktadresse
 */
@ApiModel(description = "<br>FREG: Kontaktadresse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-21T11:48:55.741350900+02:00[Europe/Oslo]")
public class ContactAddress {
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

  public static final String SERIALIZED_NAME_ADDRESS_CONFIDENTIALITY = "addressConfidentiality";
  @SerializedName(SERIALIZED_NAME_ADDRESS_CONFIDENTIALITY)
  private AddressConfidentiality addressConfidentiality;

  public static final String SERIALIZED_NAME_POST_BOX_ADDRESS = "postBoxAddress";
  @SerializedName(SERIALIZED_NAME_POST_BOX_ADDRESS)
  private ContactAddressPostBoxAddress postBoxAddress;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "streetAddress";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  private ContactAddressStreetAddress streetAddress;

  public static final String SERIALIZED_NAME_FREE_FORM_POSTAL_ADDRESS = "freeFormPostalAddress";
  @SerializedName(SERIALIZED_NAME_FREE_FORM_POSTAL_ADDRESS)
  private ContactAddressFreeFormPostalAddress freeFormPostalAddress;

  public static final String SERIALIZED_NAME_CADASTRAL_IDENTIFIER = "cadastralIdentifier";
  @SerializedName(SERIALIZED_NAME_CADASTRAL_IDENTIFIER)
  private String cadastralIdentifier;

  public ContactAddress() {
  }

  public ContactAddress registeredAt(OffsetDateTime registeredAt) {
    
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


  public ContactAddress isValid(Boolean isValid) {
    
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


  public ContactAddress source(String source) {
    
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


  public ContactAddress reason(String reason) {
    
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


  public ContactAddress validFrom(OffsetDateTime validFrom) {
    
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


  public ContactAddress validTo(OffsetDateTime validTo) {
    
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


  public ContactAddress addressConfidentiality(AddressConfidentiality addressConfidentiality) {
    
    this.addressConfidentiality = addressConfidentiality;
    return this;
  }

   /**
   * &lt;br&gt;FREG: Adressegradering
   * @return addressConfidentiality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<br>FREG: Adressegradering")

  public AddressConfidentiality getAddressConfidentiality() {
    return addressConfidentiality;
  }


  public void setAddressConfidentiality(AddressConfidentiality addressConfidentiality) {
    this.addressConfidentiality = addressConfidentiality;
  }


  public ContactAddress postBoxAddress(ContactAddressPostBoxAddress postBoxAddress) {
    
    this.postBoxAddress = postBoxAddress;
    return this;
  }

   /**
   * Get postBoxAddress
   * @return postBoxAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactAddressPostBoxAddress getPostBoxAddress() {
    return postBoxAddress;
  }


  public void setPostBoxAddress(ContactAddressPostBoxAddress postBoxAddress) {
    this.postBoxAddress = postBoxAddress;
  }


  public ContactAddress streetAddress(ContactAddressStreetAddress streetAddress) {
    
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Get streetAddress
   * @return streetAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactAddressStreetAddress getStreetAddress() {
    return streetAddress;
  }


  public void setStreetAddress(ContactAddressStreetAddress streetAddress) {
    this.streetAddress = streetAddress;
  }


  public ContactAddress freeFormPostalAddress(ContactAddressFreeFormPostalAddress freeFormPostalAddress) {
    
    this.freeFormPostalAddress = freeFormPostalAddress;
    return this;
  }

   /**
   * Get freeFormPostalAddress
   * @return freeFormPostalAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactAddressFreeFormPostalAddress getFreeFormPostalAddress() {
    return freeFormPostalAddress;
  }


  public void setFreeFormPostalAddress(ContactAddressFreeFormPostalAddress freeFormPostalAddress) {
    this.freeFormPostalAddress = freeFormPostalAddress;
  }


  public ContactAddress cadastralIdentifier(String cadastralIdentifier) {
    
    this.cadastralIdentifier = cadastralIdentifier;
    return this;
  }

   /**
   * Unique identifier from the Norwegian Mapping Authority.  &lt;br&gt;FREG: AdresseIdentifikatorFraMatrikkelen
   * @return cadastralIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14464824", value = "Unique identifier from the Norwegian Mapping Authority.  <br>FREG: AdresseIdentifikatorFraMatrikkelen")

  public String getCadastralIdentifier() {
    return cadastralIdentifier;
  }


  public void setCadastralIdentifier(String cadastralIdentifier) {
    this.cadastralIdentifier = cadastralIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactAddress contactAddress = (ContactAddress) o;
    return Objects.equals(this.registeredAt, contactAddress.registeredAt) &&
        Objects.equals(this.isValid, contactAddress.isValid) &&
        Objects.equals(this.source, contactAddress.source) &&
        Objects.equals(this.reason, contactAddress.reason) &&
        Objects.equals(this.validFrom, contactAddress.validFrom) &&
        Objects.equals(this.validTo, contactAddress.validTo) &&
        Objects.equals(this.addressConfidentiality, contactAddress.addressConfidentiality) &&
        Objects.equals(this.postBoxAddress, contactAddress.postBoxAddress) &&
        Objects.equals(this.streetAddress, contactAddress.streetAddress) &&
        Objects.equals(this.freeFormPostalAddress, contactAddress.freeFormPostalAddress) &&
        Objects.equals(this.cadastralIdentifier, contactAddress.cadastralIdentifier);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredAt, isValid, source, reason, validFrom, validTo, addressConfidentiality, postBoxAddress, streetAddress, freeFormPostalAddress, cadastralIdentifier);
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
    sb.append("class ContactAddress {\n");
    sb.append("    registeredAt: ").append(toIndentedString(registeredAt)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    addressConfidentiality: ").append(toIndentedString(addressConfidentiality)).append("\n");
    sb.append("    postBoxAddress: ").append(toIndentedString(postBoxAddress)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    freeFormPostalAddress: ").append(toIndentedString(freeFormPostalAddress)).append("\n");
    sb.append("    cadastralIdentifier: ").append(toIndentedString(cadastralIdentifier)).append("\n");
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
    openapiFields.add("addressConfidentiality");
    openapiFields.add("postBoxAddress");
    openapiFields.add("streetAddress");
    openapiFields.add("freeFormPostalAddress");
    openapiFields.add("cadastralIdentifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ContactAddress.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactAddress is not found in the empty JSON string", ContactAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContactAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactAddress` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      // validate the optional field `postBoxAddress`
      if (jsonObj.get("postBoxAddress") != null && !jsonObj.get("postBoxAddress").isJsonNull()) {
        ContactAddressPostBoxAddress.validateJsonObject(jsonObj.getAsJsonObject("postBoxAddress"));
      }
      // validate the optional field `streetAddress`
      if (jsonObj.get("streetAddress") != null && !jsonObj.get("streetAddress").isJsonNull()) {
        ContactAddressStreetAddress.validateJsonObject(jsonObj.getAsJsonObject("streetAddress"));
      }
      // validate the optional field `freeFormPostalAddress`
      if (jsonObj.get("freeFormPostalAddress") != null && !jsonObj.get("freeFormPostalAddress").isJsonNull()) {
        ContactAddressFreeFormPostalAddress.validateJsonObject(jsonObj.getAsJsonObject("freeFormPostalAddress"));
      }
      if ((jsonObj.get("cadastralIdentifier") != null && !jsonObj.get("cadastralIdentifier").isJsonNull()) && !jsonObj.get("cadastralIdentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cadastralIdentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cadastralIdentifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactAddress>() {
           @Override
           public void write(JsonWriter out, ContactAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContactAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactAddress
  * @throws IOException if the JSON string is invalid with respect to ContactAddress
  */
  public static ContactAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactAddress.class);
  }

 /**
  * Convert an instance of ContactAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
