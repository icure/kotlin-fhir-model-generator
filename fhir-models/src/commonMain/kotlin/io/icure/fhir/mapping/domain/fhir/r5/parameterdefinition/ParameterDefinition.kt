//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.parameterdefinition

import io.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Definition of a parameter to a module
 *
 * The parameters to the module. This collection specifies both the input and output parameters.
 * Input parameters are provided by the caller as part of the $evaluate operation. Output parameters
 * are included in the GuidanceResponse.
 *
 * @param id Unique id for inter-element referencing
 * @param name Name used to access the parameter value
 * @param use in | out
 * @param min Minimum cardinality
 * @param max Maximum cardinality (a number of *)
 * @param documentation A brief description of the parameter
 * @param type What type of value
 * @param profile What profile the value is expected to be
 */
@SerialName("ParameterDefinition")
@Serializable
public data class ParameterDefinition(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Name used to access the parameter value
   */
  public val name: String? = null,
  /**
   * in | out
   */
  public val use: String? = null,
  /**
   * Minimum cardinality
   */
  public val min: Int? = null,
  /**
   * Maximum cardinality (a number of *)
   */
  public val max: String? = null,
  /**
   * A brief description of the parameter
   */
  public val documentation: String? = null,
  /**
   * What type of value
   */
  public val type: String? = null,
  /**
   * What profile the value is expected to be
   */
  public val profile: String? = null,
) : DataType
