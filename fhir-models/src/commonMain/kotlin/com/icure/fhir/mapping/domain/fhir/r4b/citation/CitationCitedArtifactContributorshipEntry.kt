//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.citation

import com.icure.fhir.mapping.domain.fhir.r4b.address.Address
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.humanname.HumanName
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An individual entity named in the list
 *
 * An individual entity named in the author list or contributor list.
 *
 * @param id Unique id for inter-element referencing
 * @param name A name associated with the person
 * @param initials Initials for forename
 * @param collectiveName Used for collective or corporate name as an author
 * @param role The role of the contributor (e.g. author, editor, reviewer)
 * @param correspondingContact Indication of which contributor is the corresponding contributor for
 * the role
 * @param listOrder Used to code order of authors
 */
@SerialName("CitationCitedArtifactContributorshipEntry")
@Serializable
public data class CitationCitedArtifactContributorshipEntry(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A name associated with the person
   */
  public val name: HumanName? = null,
  /**
   * Initials for forename
   */
  public val initials: String? = null,
  /**
   * Used for collective or corporate name as an author
   */
  public val collectiveName: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  public val affiliationInfo: List<CitationCitedArtifactContributorshipEntryAffiliationInfo> =
      emptyList(),
  public val address: List<Address> = emptyList(),
  public val telecom: List<ContactPoint> = emptyList(),
  public val contributionType: List<CodeableConcept> = emptyList(),
  /**
   * The role of the contributor (e.g. author, editor, reviewer)
   */
  public val role: CodeableConcept? = null,
  public val contributionInstance:
      List<CitationCitedArtifactContributorshipEntryContributionInstance> = emptyList(),
  /**
   * Indication of which contributor is the corresponding contributor for the role
   */
  public val correspondingContact: Boolean? = null,
  /**
   * Used to code order of authors
   */
  public val listOrder: Int? = null,
) : BackboneElement
