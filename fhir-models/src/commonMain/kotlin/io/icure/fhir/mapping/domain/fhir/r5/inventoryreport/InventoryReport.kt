//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.inventoryreport

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A report of inventory or stock items
 *
 * A report of inventory or stock items.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status draft | requested | active | entered-in-error
 * @param countType snapshot | difference
 * @param operationType addition | subtraction
 * @param operationTypeReason The reason for this count - regular count, ad-hoc count, new arrivals,
 * etc
 * @param reportedDateTime When the report has been submitted
 * @param reporter Who submits the report
 * @param reportingPeriod The period the report refers to
 */
@SerialName("InventoryReport")
@Serializable
public data class InventoryReport(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * draft | requested | active | entered-in-error
   */
  public val status: String? = null,
  /**
   * snapshot | difference
   */
  public val countType: String? = null,
  /**
   * addition | subtraction
   */
  public val operationType: CodeableConcept? = null,
  /**
   * The reason for this count - regular count, ad-hoc count, new arrivals, etc
   */
  public val operationTypeReason: CodeableConcept? = null,
  /**
   * When the report has been submitted
   */
  public val reportedDateTime: String? = null,
  /**
   * Who submits the report
   */
  public val reporter: Reference? = null,
  /**
   * The period the report refers to
   */
  public val reportingPeriod: Period? = null,
  public val inventoryListing: List<InventoryReportInventoryListing> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
