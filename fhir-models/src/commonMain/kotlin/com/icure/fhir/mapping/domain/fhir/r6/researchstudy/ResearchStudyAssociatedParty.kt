//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.researchstudy

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Sponsors, collaborators, and other parties
 *
 * Sponsors, collaborators, and other parties.
 *
 * @param id Unique id for inter-element referencing
 * @param name Name of associated party
 * @param role sponsor | lead-sponsor | sponsor-investigator | primary-investigator | collaborator |
 * funding-source | general-contact | recruitment-contact | sub-investigator | study-director |
 * study-chair
 * @param party Individual or organization associated with study (use practitionerRole to specify
 * their organisation)
 */
@SerialName("ResearchStudyAssociatedParty")
@Serializable
public data class ResearchStudyAssociatedParty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name of associated party
   */
  public val name: String? = null,
  /**
   * sponsor | lead-sponsor | sponsor-investigator | primary-investigator | collaborator |
   * funding-source | general-contact | recruitment-contact | sub-investigator | study-director |
   * study-chair
   */
  public val role: CodeableConcept,
  public val period: List<Period> = emptyList(),
  public val classifier: List<CodeableConcept> = emptyList(),
  /**
   * Individual or organization associated with study (use practitionerRole to specify their
   * organisation)
   */
  public val party: Reference? = null,
) : BackboneElement
