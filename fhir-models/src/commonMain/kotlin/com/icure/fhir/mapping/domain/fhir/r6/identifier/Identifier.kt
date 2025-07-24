//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.identifier

import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.datatype.DataType
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An identifier intended for computation
 *
 * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for
 * business identifiers.
 *
 * @param id Unique id for inter-element referencing
 * @param use usual | official | temp | secondary | old (If known)
 * @param type Description of identifier
 * @param system The namespace for the identifier value
 * @param value The value that is unique
 * @param period Time period when id is/was valid for use
 * @param assigner Organization that issued id (may be just text)
 */
@SerialName("Identifier")
@Serializable
public data class Identifier(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * usual | official | temp | secondary | old (If known)
   */
  public val use: String? = null,
  /**
   * Description of identifier
   */
  public val type: CodeableConcept? = null,
  /**
   * The namespace for the identifier value
   */
  public val system: String? = null,
  /**
   * The value that is unique
   */
  public val `value`: String? = null,
  /**
   * Time period when id is/was valid for use
   */
  public val period: Period? = null,
  /**
   * Organization that issued id (may be just text)
   */
  public val assigner: Reference? = null,
) : DataType
