//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.usagecontext

import io.icure.fhir.mapping.domain.fhir.r4.Element
import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.range.Range
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes the context of use for a conformance or knowledge resource
 *
 * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize
 * an artifact. This metadata can either be specific to the applicable population (e.g., age category,
 * DRG) or the specific context of care (e.g., venue, care setting, provider of care).
 *
 * @param id Unique id for inter-element referencing
 * @param code Type of context being specified
 * @param valueCodeableConcept Value that defines the context
 * @param valueQuantity Value that defines the context
 * @param valueRange Value that defines the context
 * @param valueReference Value that defines the context
 */
@SerialName("UsageContext")
@Serializable
public data class UsageContext(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Type of context being specified
   */
  public val code: Coding,
  /**
   * Value that defines the context
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Value that defines the context
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Value that defines the context
   */
  public val valueRange: Range? = null,
  /**
   * Value that defines the context
   */
  public val valueReference: Reference? = null,
) : Element
