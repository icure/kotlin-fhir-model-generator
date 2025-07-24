//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.documentreference

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Clinical context of document
 *
 * The clinical context in which the document was prepared.
 *
 * @param id Unique id for inter-element referencing
 * @param period Time of service that is being documented
 * @param facilityType Kind of facility where patient was seen
 * @param practiceSetting Additional details about where the content was created (e.g. clinical
 * specialty)
 * @param sourcePatientInfo Patient demographics from source
 */
@SerialName("DocumentReferenceContext")
@Serializable
public data class DocumentReferenceContext(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val encounter: List<Reference> = emptyList(),
  public val event: List<CodeableConcept> = emptyList(),
  /**
   * Time of service that is being documented
   */
  public val period: Period? = null,
  /**
   * Kind of facility where patient was seen
   */
  public val facilityType: CodeableConcept? = null,
  /**
   * Additional details about where the content was created (e.g. clinical specialty)
   */
  public val practiceSetting: CodeableConcept? = null,
  /**
   * Patient demographics from source
   */
  public val sourcePatientInfo: Reference? = null,
  public val related: List<Reference> = emptyList(),
) : BackboneElement
