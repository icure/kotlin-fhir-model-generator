//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.evidencevariable

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.relatedartifact.RelatedArtifact
import io.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A definition of an exposure, outcome, or other variable
 *
 * The EvidenceVariable resource describes an element that knowledge (Evidence) is about.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this evidence variable, represented as a URI (globally
 * unique)
 * @param version Business version of the evidence variable
 * @param name Name for this evidence variable (computer friendly)
 * @param title Name for this evidence variable (human friendly)
 * @param shortTitle Title for use in informal contexts
 * @param subtitle Subordinate title of the EvidenceVariable
 * @param status draft | active | retired | unknown
 * @param date Date last changed
 * @param description Natural language description of the evidence variable
 * @param publisher Name of the publisher (organization or individual)
 * @param actual Actual or conceptual
 * @param characteristicCombination intersection | union
 * @param handling continuous | dichotomous | ordinal | polychotomous
 */
@SerialName("EvidenceVariable")
@Serializable
public data class EvidenceVariable(
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
  /**
   * Canonical identifier for this evidence variable, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the evidence variable
   */
  public val version: String? = null,
  /**
   * Name for this evidence variable (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this evidence variable (human friendly)
   */
  public val title: String? = null,
  /**
   * Title for use in informal contexts
   */
  public val shortTitle: String? = null,
  /**
   * Subordinate title of the EvidenceVariable
   */
  public val subtitle: String? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * Date last changed
   */
  public val date: String? = null,
  /**
   * Natural language description of the evidence variable
   */
  public val description: String? = null,
  public val note: List<Annotation> = emptyList(),
  public val useContext: List<UsageContext> = emptyList(),
  /**
   * Name of the publisher (organization or individual)
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  public val author: List<ContactDetail> = emptyList(),
  public val editor: List<ContactDetail> = emptyList(),
  public val reviewer: List<ContactDetail> = emptyList(),
  public val endorser: List<ContactDetail> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  /**
   * Actual or conceptual
   */
  public val `actual`: Boolean? = null,
  /**
   * intersection | union
   */
  public val characteristicCombination: String? = null,
  public val characteristic: List<EvidenceVariableCharacteristic> = emptyList(),
  /**
   * continuous | dichotomous | ordinal | polychotomous
   */
  public val handling: String? = null,
  public val category: List<EvidenceVariableCategory> = emptyList(),
) : DomainResource
