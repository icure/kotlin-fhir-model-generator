//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.biologicallyderivedproductdispense

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A record of dispensation of a biologically derived product
 *
 * This resource reflects an instance of a biologically derived product dispense. The supply or
 * dispense of a biologically derived product from the supply organization or department (e.g. hospital
 * transfusion laboratory) to the clinical team responsible for clinical application.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status preparation | in-progress | allocated | issued | unfulfilled | returned |
 * entered-in-error | unknown
 * @param originRelationshipType Relationship between the donor and intended recipient
 * @param product The BiologicallyDerivedProduct that is dispensed
 * @param patient The intended recipient of the dispensed product
 * @param matchStatus Indicates the type of matching associated with the dispense
 * @param location Where the dispense occurred
 * @param quantity Amount dispensed
 * @param preparedDate When product was selected/matched
 * @param whenHandedOver When the product was dispatched
 * @param destination Where the product was dispatched to
 * @param usageInstruction Specific instructions for use
 */
@SerialName("BiologicallyDerivedProductDispense")
@Serializable
public data class BiologicallyDerivedProductDispense(
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
  public val basedOn: List<Reference> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  /**
   * preparation | in-progress | allocated | issued | unfulfilled | returned | entered-in-error |
   * unknown
   */
  public val status: String? = null,
  /**
   * Relationship between the donor and intended recipient
   */
  public val originRelationshipType: CodeableConcept? = null,
  /**
   * The BiologicallyDerivedProduct that is dispensed
   */
  public val product: Reference,
  /**
   * The intended recipient of the dispensed product
   */
  public val patient: Reference,
  /**
   * Indicates the type of matching associated with the dispense
   */
  public val matchStatus: CodeableConcept? = null,
  public val performer: List<BiologicallyDerivedProductDispensePerformer> = emptyList(),
  /**
   * Where the dispense occurred
   */
  public val location: Reference? = null,
  /**
   * Amount dispensed
   */
  public val quantity: Quantity? = null,
  /**
   * When product was selected/matched
   */
  public val preparedDate: String? = null,
  /**
   * When the product was dispatched
   */
  public val whenHandedOver: String? = null,
  /**
   * Where the product was dispatched to
   */
  public val destination: Reference? = null,
  public val note: List<Annotation> = emptyList(),
  /**
   * Specific instructions for use
   */
  public val usageInstruction: String? = null,
) : DomainResource
