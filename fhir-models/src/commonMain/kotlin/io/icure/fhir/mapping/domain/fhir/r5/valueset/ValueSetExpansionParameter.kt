//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.valueset

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Parameter that controlled the expansion process
 *
 * A parameter that controlled the expansion process. These parameters may be used by users of
 * expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick
 * the correct expansion.
 *
 * @param id Unique id for inter-element referencing
 * @param name Name as assigned by the client or server
 * @param valueString Value of the named parameter
 * @param valueBoolean Value of the named parameter
 * @param valueInteger Value of the named parameter
 * @param valueDecimal Value of the named parameter
 * @param valueUri Value of the named parameter
 * @param valueCode Value of the named parameter
 * @param valueDateTime Value of the named parameter
 */
@SerialName("ValueSetExpansionParameter")
@Serializable
public data class ValueSetExpansionParameter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name as assigned by the client or server
   */
  public val name: String? = null,
  /**
   * Value of the named parameter
   */
  public val valueString: String? = null,
  /**
   * Value of the named parameter
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Value of the named parameter
   */
  public val valueInteger: Int? = null,
  /**
   * Value of the named parameter
   */
  public val valueDecimal: Float? = null,
  /**
   * Value of the named parameter
   */
  public val valueUri: String? = null,
  /**
   * Value of the named parameter
   */
  public val valueCode: String? = null,
  /**
   * Value of the named parameter
   */
  public val valueDateTime: String? = null,
) : BackboneElement
