//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.molecularsequence

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * External repository which contains detailed report related with observedSeq in this resource
 *
 * Configurations of the external repository. The repository shall store target's observedSeq or
 * records related with target's observedSeq.
 *
 * @param id Unique id for inter-element referencing
 * @param type directlink | openapi | login | oauth | other
 * @param url URI of the repository
 * @param name Repository's name
 * @param datasetId Id of the dataset that used to call for dataset in repository
 * @param variantsetId Id of the variantset that used to call for variantset in repository
 * @param readsetId Id of the read
 */
@SerialName("MolecularSequenceRepository")
@Serializable
public data class MolecularSequenceRepository(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * directlink | openapi | login | oauth | other
   */
  public val type: String? = null,
  /**
   * URI of the repository
   */
  public val url: String? = null,
  /**
   * Repository's name
   */
  public val name: String? = null,
  /**
   * Id of the dataset that used to call for dataset in repository
   */
  public val datasetId: String? = null,
  /**
   * Id of the variantset that used to call for variantset in repository
   */
  public val variantsetId: String? = null,
  /**
   * Id of the read
   */
  public val readsetId: String? = null,
) : BackboneElement
