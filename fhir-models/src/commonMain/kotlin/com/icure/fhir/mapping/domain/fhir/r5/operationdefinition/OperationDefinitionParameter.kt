//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.operationdefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Parameters for the operation/query
 *
 * The parameters for the operation/query.
 *
 * @param id Unique id for inter-element referencing
 * @param name Name in Parameters.parameter.name or in URL
 * @param use in | out
 * @param min Minimum Cardinality
 * @param max Maximum Cardinality (a number or *)
 * @param documentation Description of meaning/use
 * @param type What type this parameter has
 * @param searchType number | date | string | token | reference | composite | quantity | uri |
 * special
 * @param binding ValueSet details if this is coded
 */
@SerialName("OperationDefinitionParameter")
@Serializable
public data class OperationDefinitionParameter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name in Parameters.parameter.name or in URL
   */
  public val name: String? = null,
  /**
   * in | out
   */
  public val use: String? = null,
  public val scope: List<String> = emptyList(),
  /**
   * Minimum Cardinality
   */
  public val min: Int? = null,
  /**
   * Maximum Cardinality (a number or *)
   */
  public val max: String? = null,
  /**
   * Description of meaning/use
   */
  public val documentation: String? = null,
  /**
   * What type this parameter has
   */
  public val type: String? = null,
  public val allowedType: List<String> = emptyList(),
  public val targetProfile: List<String> = emptyList(),
  /**
   * number | date | string | token | reference | composite | quantity | uri | special
   */
  public val searchType: String? = null,
  /**
   * ValueSet details if this is coded
   */
  public val binding: OperationDefinitionParameterBinding? = null,
  public val referencedFrom: List<OperationDefinitionParameterReferencedFrom> = emptyList(),
  public val part: List<OperationDefinitionParameter> = emptyList(),
) : BackboneElement
