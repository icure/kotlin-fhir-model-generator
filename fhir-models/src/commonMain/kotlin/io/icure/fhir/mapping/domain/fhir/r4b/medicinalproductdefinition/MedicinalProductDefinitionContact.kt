//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.medicinalproductdefinition

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A product specific contact, person (in a role), or an organization
 *
 * A product specific contact, person (in a role), or an organization.
 *
 * @param id Unique id for inter-element referencing
 * @param type Allows the contact to be classified, for example QPPV, Pharmacovigilance Enquiry
 * Information
 * @param contact A product specific contact, person (in a role), or an organization
 */
@SerialName("MedicinalProductDefinitionContact")
@Serializable
public data class MedicinalProductDefinitionContact(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Allows the contact to be classified, for example QPPV, Pharmacovigilance Enquiry Information
   */
  public val type: CodeableConcept? = null,
  /**
   * A product specific contact, person (in a role), or an organization
   */
  public val contact: Reference,
) : BackboneElement
